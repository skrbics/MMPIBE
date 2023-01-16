package si.unm.fis.skrbic.mmpibe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import si.unm.fis.skrbic.mmpibe.domain.TestCardCounter;

public interface TestCardCounterRepo extends JpaRepository<TestCardCounter, Integer> {
    TestCardCounter findByUserId(String s);
}
