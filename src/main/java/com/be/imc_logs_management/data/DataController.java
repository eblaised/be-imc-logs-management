package com.be.imc_logs_management.data;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("data")
public class DataController {

    private final DataService dataService;

    @GetMapping
    public List<Data> search(){
        log.info("Read data");
        return this.dataService.search();
    }


    @PostMapping
    public Data calculate(@RequestBody Data data){
        log.info("Calculating data: {} ", data);
        return this.dataService.calculate(data);
    }
}
