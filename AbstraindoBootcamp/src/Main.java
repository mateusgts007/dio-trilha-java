import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

       Curso curso1 = new Curso();
        
       curso1.setTitulo("java");
       curso1.setDescricao("Curso de java");
       curso1.setCargaHoraria(100);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao boot camp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devmateus = new Dev();
        devmateus.setNome("Mateus");
        devmateus.increverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos:" + devmateus.getConteudosIncritos());

    }


}

