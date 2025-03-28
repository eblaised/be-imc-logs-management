package com.be.imc_logs_management.data;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("data")
public class DataController {

    private final DataService dataService;

    @GetMapping
    public List<Data> search(){
        return this.dataService.search();
    }


    @PostMapping
    public Data calculate(@RequestBody Data data){
        return this.dataService.calculate(data);
    }
}
