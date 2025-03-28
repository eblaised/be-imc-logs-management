package com.be.imc_logs_management.data;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DataService {
    private final DataRepository dataRepository;

    public List<Data> search() {
        return this.dataRepository.findAll();
    }

    public Data calculate(Data data) {
        return this.dataRepository.save(data);
    }

/*
    public Map<String, String> calculate(ImcDTO data) {
        double imc = data.weight() / Math.pow(data.height(), 2);
        imc = (double) Math.round(imc * 100) / 100;
        String advice = this.analyze(imc);

        return Map.of("imc", String.valueOf(imc),
                "advice", advice);
    }*/

    private String analyze(double imc) {
        if (imc < 16) {
            return "Anorexia or malnutrition";
        } else if (imc >= 16.5 && imc < 18.5) {
            return "Underweight";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal weight";
        } else if (imc >= 25 && imc < 30) {
            return "Overweight";
        } else if (imc >= 30 && imc < 35) {
            return "Moderate obesity (Class 1)";
        } else if (imc >= 35 && imc < 40) {
            return "Severe obesity (Class 2)";
        } else {
            return "Morbid or massive obesity";
        }
    }
}
