package ${package}.repository;

import ${package}.model.audit.AuditHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditHistoryRepository extends JpaRepository<AuditHistory, Long> {
}
