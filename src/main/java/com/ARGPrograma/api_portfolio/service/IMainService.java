
package com.ARGPrograma.api_portfolio.service;

import com.ARGPrograma.api_portfolio.entity.Main;
import java.util.List;


public interface IMainService {

    public List<Main> getMain();

    public void saveMain(Main main);

    public void deleteMain (Long id);

    public Main findMain ( Long id);
}
