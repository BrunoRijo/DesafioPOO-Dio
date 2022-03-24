import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScrypt");
        curso2.setDescricao("descrição curso Javascrypt");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();

/*
        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev bruno = new Dev();
        bruno.setNome("Bruno");
        bruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + bruno.getConteudosInscritos());
        bruno.progredir();
        System.out.println("Conteudos concluidos" + bruno.getConteudosConcluidos());
        System.out.println("XP: " + bruno.calcularTotalXp());


        Dev francisco = new Dev();
        francisco.inscreverBootcamp(bootcamp);
        francisco.setNome("Francisco");
        System.out.println("Conteudos inscritos" + bruno.getConteudosInscritos());
        francisco.progredir();
        francisco.progredir();
        francisco.progredir();
        System.out.println("Conteudos concluidos" + bruno.getConteudosConcluidos());
        System.out.println("XP: " + francisco.calcularTotalXp());




    }
}
