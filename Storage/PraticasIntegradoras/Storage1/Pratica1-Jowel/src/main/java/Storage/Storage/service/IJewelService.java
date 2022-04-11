package Storage.Storage.service;

import Storage.Storage.exception.NotFoundJewelException;
import Storage.Storage.model.Jewel;

import java.util.List;

public interface IJewelService {
    public List<Jewel> getJewel();
    public Jewel saveJewel(Jewel entity);
    public void deleteJewel(Long id);
    public Jewel findJewel(Long id) throws NotFoundJewelException;
}
