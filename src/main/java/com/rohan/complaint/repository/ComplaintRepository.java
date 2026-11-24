package com.rohan.complaint.repository;
import com.rohan.complaint.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ComplaintRepository extends JpaRepository<Complaint,Long> {
 List<Complaint> findByEmailIgnoreCaseOrderByCreatedAtDesc(String email);
 List<Complaint> findAllByOrderByCreatedAtDesc();
}
