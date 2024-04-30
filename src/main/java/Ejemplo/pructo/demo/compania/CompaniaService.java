package Ejemplo.pructo.demo.compania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompaniaService {
    
    @Autowired
    private CompaniaRepository companiaRepository;

    //metodo create
    public Compania save(Compania entity){
        return companiaRepository.save(entity);
    }

    //metodo select by id
   
    public Compania findById(Long id)
    {
        return companiaRepository.findById(id).orElse(null);
    }

   
    }
