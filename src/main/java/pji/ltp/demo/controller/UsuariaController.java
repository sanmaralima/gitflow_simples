@RestController
public class UsuariaController{
    List<Usuaria> listaUsuaria = new ArrayList<>();

    public UsuariaController(){
        listaUsuaria.add(
            new Usuaria()
        );
        listaUsuaria.add(
            new Usuaria()
        );
    }

    @GetMapping("/usuaria/{id}")
    public Usuaria getUsuariaById(
        @PathVariable("id") Long idUsuaria
    ){
        return listaUsuaria.get(idUsuaria.intValue() - 1);
    }

}