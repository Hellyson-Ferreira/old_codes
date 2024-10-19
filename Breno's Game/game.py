'''Desenvolvedores: Benjamim Sousa,Felipe Anderson, Hellyson Gabriel'''
import emoji
from time import sleep

print('\033[31mPREPAREM-SE CRIANÇAS, O BRENO´S GAME VAI COMEÇAR')
print('''\033[32mDeseja iniciar o BRENO´S GAME no modo HARD ou NORMAL?
[ H ]----------PARA INICIAR NO MODO HARD.
-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
[ N ]----------PARA INICIAR NO MODO NORMAL.''')

valid_op = False
while valid_op == False:
    opçao = input('\033[32mDigite a opção H/N: ').upper()
    if opçao == 'H' or opçao == 'N':
        valid_op = True

    else:
        print('\033[35mOpção invalida.')
        print('\033[35mTente novamente:')
    if opçao == 'H':
        sleep(1.5)
        print('\033[1;36mO BRENO´S GAME HARD !!!')
        print(emoji.emojize(':fire:' * 30))
        b = []
        for c in range(1000):
            nome = input('\033[0mDigite o nome do aluno danado: ').upper()
            b.append(nome)
            if nome in b:
                print(emoji.emojize('\033[4;31m{} está expulso(a) de sala.:bomb::gun::gun:', use_aliases=True).format(
                    nome))

    elif opçao == 'N':
        sleep(1.5)
        print('\033[0m=-=-=-' * 15)
        print(emoji.emojize(':skull:' * 42))
        print('\033[0m{}{}{}'.format('-' * 10, 'BRENO´S GAME', '-' * 10))
        print(emoji.emojize(':skull:' * 42))
        print('\033[0m=-=-=-' * 15)
        a = []
        for c in range(1000):
            n = input('\033[0mDigite o nome do aluno danado: ').upper()
            if n in a:
                print(
                    emoji.emojize('\033[4;31m{} está expulso(a) de sala.:bomb::gun::gun:').format(n))
                print('\033[32m-' * 5)
                a.append(n)
            else:
                a.append(n)
