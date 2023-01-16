package si.unm.fis.skrbic.mmpibe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import si.unm.fis.skrbic.mmpibe.domain.TestCard;
import si.unm.fis.skrbic.mmpibe.domain.TestCardCounter;

public interface TestCardRepo extends JpaRepository<TestCard,Integer> {
    TestCard findByOrdinalNo(int ordinalNo);
}
