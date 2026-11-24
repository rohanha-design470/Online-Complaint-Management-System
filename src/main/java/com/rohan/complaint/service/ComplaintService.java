package com.rohan.complaint.service;
import com.rohan.complaint.entity.Complaint;
import com.rohan.complaint.repository.ComplaintRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ComplaintService {
 private final ComplaintRepository repo;
 public ComplaintService(ComplaintRepository repo){this.repo=repo;}
 public Complaint save(Complaint c){return repo.save(c);}
 public List<Complaint> all(){return repo.findAllByOrderByCreatedAtDesc();}
 public List<Complaint> byEmail(String email){return repo.findByEmailIgnoreCaseOrderByCreatedAtDesc(email);}
 public Complaint find(Long id){return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Complaint not found: "+id));}
 public void updateStatus(Long id,String status){Complaint c=find(id);c.setStatus(status);repo.save(c);}
 public void delete(Long id){repo.deleteById(id);}
}
