package Storage.Storage.service;

import Storage.Storage.exception.NotFoundJewelException;
import Storage.Storage.model.Jewel;
import Storage.Storage.repository.JewelRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class JewelServiceImpl implements IJewelService {

   private final JewelRepository repository;

   public JewelServiceImpl(JewelRepository repository){
       this.repository = repository;
   }

    @Override
    @Transactional(readOnly = true)
    public List<Jewel> getJewel() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Jewel saveJewel(Jewel jewel) {
        return repository.save(jewel);
    }

    @Override
    @Transactional
    public void deleteJewel(Long id) {
       repository.deleteById(id);
    }

    @Override
    @Transactional
    public Jewel findJewel(Long id) {
        Optional<Jewel> optionalJewel = repository.findById(id);
        optionalJewel.orElseThrow(() -> new NotFoundJewelException("Jewel with ID " + id + " not found"));
        return optionalJewel.get();
    }
}
