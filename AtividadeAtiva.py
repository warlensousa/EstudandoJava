# Aluno: Warlen de Sousa Araujo. 
# N: 2372190216.
# Atividade_Ativa

# 2. Uma primeira função permitirá o usuário digitar um número qualquer e o programa deve procurar esse número na lista;
def verificarNumeroList(lista, numero):
    if numero in lista:
        return f"O número {numero} se encontra na lista."
    else: 
        return f"O número {numero} não se encontra na lista."

# 3. A segunda função a ser criada fará o programa perguntar ao usuário se ele quer a lista ordenada de forma crescente ou decrescente.
def ordenarLista(lista):
    ordem = input("Você quer a lista ordenada de forma crescente ou decrescente? Digite 1 para crescente ou 2 para decrescente: ").strip()
    if ordem == '1':
        lista.sort()
        print("Lista ordenada de forma crescente: ", lista)
    elif ordem == '2':
        lista.sort(reverse=True)
        print("Lista ordenada de forma decrescente: ", lista)
    else:
        print("Valor Inválido. A lista não foi ordenada. Por favor, digite um valor válido!")

# 1. Função receba do usuário uma lista de números.
def main():
    lista = []
    while True:
        numero = input("Digite um número para adicionar à lista: | Digite 's' caso queira sair. ").strip()
        if numero.lower() == 's':
            break
        try:
            lista.append(int(numero))
        except ValueError:
            print("Por favor, digite um valor válido.")
    
    while True:
        try:
            numeroProcurado = int(input("Digite um número para verificar se existe na lista: "))
            print(verificarNumeroList(lista, numeroProcurado))
            break
        except ValueError:
            print("Por favor, digite um número válido.")
    
    ordenarLista(lista)

if __name__ == "__main__":
    main()
