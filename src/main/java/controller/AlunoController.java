package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apisys.aluno.model.Aluno;
import com.apisys.aluno.repository.AlunoRepository;

@RestController
public class AlunoController {
    @Autowired
    AlunoRepository repository;
    
  @RequestMapping("/save")
  public String process(){
      repository.save(new Aluno("Fernando", null, 0, 0));
      return "Done";
  }
    
    
  @RequestMapping("/findall")
  public String findAll(){
      String result = "<html>";
        
      for(Aluno alu : repository.findAll()){
          result += "<div>" + alu.toString() + "</div>";
      }
        
      return result + "</html>";
  }
	
	

}
