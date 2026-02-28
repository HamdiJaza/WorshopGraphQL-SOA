package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.Module;
import repository.ModuleBusiness;

import java.util.List;

public class Query implements GraphQLRootResolver {
    ModuleBusiness moduleBusiness;
    public Query(ModuleBusiness mb){
        moduleBusiness = mb;
    }
    public List<Module> getallmodules(){
        return moduleBusiness.getAllModules();
    }



}
