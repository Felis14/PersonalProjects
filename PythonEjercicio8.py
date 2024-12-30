#Félix Soto
import random

palabra = ['Mesa','Casa','Software','Python','Computadora', 'Profesor', 'Larry', 'Musica']
ltrs = 0
tryw = 0
turn = 1
focus = False

palbr = random.choice(palabra)
limite = len(palbr)

print(f'La letra contiene {limite} espacios')

while tryw <= limite:
    
    text = input('Digite una letra: ')
    for i in range (0,limite):
        if palbr[i] == text:
            focus = True
            ltrs += 1
            break
        else:
            focus = False
    tryw += 1
    
    print(f'Intentos {tryw} de {limite}')
    
    if focus == True:
        print('Letra acertada')
    else:
        print('Letra incorrecta')
        
    if ltrs == limite:
        break

print(f'La palabra era: {palbr}')
    
    
   
    
