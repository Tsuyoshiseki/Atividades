using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ConstrainedExecution;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;
namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //atribui uma tecla no caso "s" de sim para continuar
            string continuar = "s";


            //repetição da enquete até apertar outra tecla
            while (continuar == "s")
            {
                //PERGUNTAR A IDADE DO USUARIO
                Console.WriteLine("Qual é a sua idade?");

                //Atribui um nome para string digitada(idade)
                string idadeDigitada;

                //RECEBA A IDADE DIGITADA PELO USUÁRIO
                idadeDigitada = Console.ReadLine();

                //Atribui um nome em int para conversão da idade de string para int
                int idade;

                //CONVERTA A IDADE INFORMADA PARA INTEIRO
                //repetição usando while até a conclusão da resposta pedida

                bool foiConvertido = Int32.TryParse(idadeDigitada, out idade);

                while (!foiConvertido)
                {

                    //PERGUNTAR A IDADE DO USUARIO, caso ele tenha errado na primeira vez
                    Console.WriteLine("Digite um numero inteiro referente a idade");

                    //RECEBA A IDADE DIGITADA PELO USUÁRIO
                    idadeDigitada = Console.ReadLine();

                    //verificar conversão, apenas em algarismos inteiros/ números
                    Int32.TryParse(idadeDigitada, out idade);

                }//

                //conversão, visto que o digitado foi o correto
                idade = Convert.ToInt32(idadeDigitada);

                //SE IDADE FOR <= 12
                if (idade <= 12)
                {
                    //EXIBIR MENSAGEM PARA O USUARIO DIZENDO "VOCE É CRIANÇA"
                    Console.WriteLine("Você é criança");
                }

                //SE IDADE FOR > 12 E < 18
                else if (idade > 12 && idade < 18)
                {
                    //EXIBIR MENSAGEM PARA O USUARIO DIZENDO ADOLESCENTE
                    Console.WriteLine("Você é adolescente");
                }
                //se idade for MAIOR ou igual QUE 18
                else if (idade >= 18 && idade < 65)
                {

                    //EXIBIR MENSAGEM PARA O USUARIO DIZENDO ADULTO
                    Console.WriteLine("Você é adulto");

                }
                else
                {
                    //EXIBIR MENSAGEM PARA O USUARIO DIZENDO idoso, se maior igual a 65
                    Console.WriteLine("Você é idoso");
                }

                //EXIBIR MENSAGEM PARA O USUARIO DIZENDO se quer repetir as perguntas
                Console.WriteLine("Você quer digitar uma nova idade? \nDigite (s) para digitar novamente, caso contrário aperte (n)");

                //le o caracter digitado pelo usuário e finaliza a enquete ou vota a repetir
                continuar = Console.ReadLine();

                //Transforma o "S" em minúscula "s"
                continuar = continuar.ToLower();

            //fecha o while (enquetes) 
            }

            

        }
    }
}
