package Storage.Storage.dto;

import Storage.Storage.model.Jewel;

public class ConvertJewelRequest {
    public Jewel convert(JewelRequest request){
        return Jewel.builder()
                .material(request.getMaterial())
                .weight(request.getWeight())
                .carats(request.getCarats())
                .build();
    }
}
