package si.unm.fis.skrbic.mmpibe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.unm.fis.skrbic.mmpibe.domain.TestCard;
import si.unm.fis.skrbic.mmpibe.domain.TestCardCounter;
import si.unm.fis.skrbic.mmpibe.repos.TestCardCounterRepo;
import si.unm.fis.skrbic.mmpibe.repos.TestCardRepo;

@Service
public class TestCardService {

    private TestCardCounterRepo tccr;
    private TestCardRepo tcr;
    public TestCardService(TestCardCounterRepo tccr, TestCardRepo tcr) {
        this.tccr = tccr;
        this.tcr = tcr;
        TestCard tc = new TestCard("Ovo je prva tvrdnja.",1);
        tcr.save(tc);
        tc = new TestCard("Ovo je druga tvrdnja.",2);
        tcr.save(tc);
        tc = new TestCard("Ovo je treca tvrdnja.",3);
        tcr.save(tc);
        tc = new TestCard("Ovo je cetvrta tvrdnja.",4);
        tcr.save(tc);
        tc = new TestCard("Ovo je peta tvrdnja.",5);
        tcr.save(tc);
    }

    public TestCard getNextTestCard(String userId){
        TestCardCounter tcc = tccr.findByUserId(userId);
        TestCard tempTC = null;
        if(tcc!=null){
            tcc.setCounter(tcc.getCounter()+1);
        }else{
            tcc = new TestCardCounter(userId,1);
        }
        tccr.save(tcc);
        tempTC = tcr.findByOrdinalNo(tcc.getCounter());
        if(tempTC!=null){
            return tempTC;
        }else{
            return null;
        }
    }
}
