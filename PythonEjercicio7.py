#Félix Soto
TarPunta = 3500
TarParr = 5000
TarQueps = 6000
TarMaAn = 8000
seg = 1

print('- - - - - - - Terminal de Autobuses - - - - - - -')
while seg == 1:
    confirma = 0
    while confirma == 0:
        print('Destinos: [1] Puntarenas   [2] Parrita   [3] Quepos   [4] Manuel Antonio')
        print('\nHorarios: [1] 6:00 a.m.   [2] 8:00 a.m.   [3] 10:00 a.m.   [4] 12:00 m.d.\n          [5] 2:00 p.m.   [6] 4:00 p.m.   [7] 6:00 p.m.    [8] 7:00 p.m.')

        while True:
            dest = int(input('\nSeleccione su destino: '))
            if dest >= 1 and dest <= 4:
                break
            else:
                print('Opción no válida.')

        while True:
            horasalida = int(input('\nSeleccione su horario de salida: '))
            if horasalida >= 1 and horasalida <= 8:
                break
            else:
                print('Opción no válida.')

        while True:
            bolts = int(input('\nDigite la cantidad de boletos: '))
            if bolts >= 0 and bolts <= 20:
                break

            if bolts == 44:
                print('Por favor, no puede comprar todos los asientos...')
            elif bolts >= 21:
                print('No puede comprar más de diez boletos.')

        if dest == 1:
            desti = 'Puntarenas'
        elif dest == 2:
            desti = 'Parrita'
        elif dest == 3:
            desti = 'Quepos'
        else:
            desti = 'Manuel Antonio'

        if horasalida == 1:
            horario = '6:00 a.m.'
        elif horasalida == 2:
            horario = '8:00 a.m.'
        elif horasalida == 3:
            horario = '10:00 a.m.'
        elif horasalida == 4:
            horario = '12:00 m.d.'
        elif horasalida == 5:
            horario = '2:00 p.m.'
        elif horasalida == 6:
            horario = '4:00 p.m.'
        elif horasalida == 7:
            horario = '6:00 p.m.'
        elif horasalida == 8:
            horario = '7:00 p.m.'
            
        
        if bolts == 1:
            while True:
                desc = int(input('\nSeleccione su preferencia de asiento: [1] Ventana   [2] Pasillo \n> '))
                if desc == 1 or desc == 2:
                    break

        if bolts == 1:    
            print(f'\nUsted compró {bolts} boleto.\nSu destino es {desti} y su horario es {horario}')
        else:
            print(f'\nUsted compró {bolts} boletos.\nSu destino es {desti} y su horario es {horario}')
            
        if bolts == 1:
            if desc == 1:
                pref = 'Ventana'
            else:
                pref = 'Pasillo'
            print(f'Su preferencia de asiento es {pref}')

        if dest == 1:
            print(f'Su monto a cancelar es de {TarPunta*bolts}.')
        elif dest == 2:
            print(f'Su monto a cancelar es de {TarParr*bolts}.')
        elif dest == 3:
            print(f'Su monto a cancelar es de {TarQueps*bolts}.')
        else:
            print(f'Su monto a cancelar es de {TarMaAn*bolts}.')

        while True:
            confirma = int(input('\n¿Es esto correcto? [1] Sí   [0] No > '))
            if confirma == 1 or confirma == 0:
                break

        if confirma == 1:
            while True:
                seg = int(input('\n¿Desea comprar más boletos? [1] Sí   [0] No > '))
                if seg == 1 or seg == 0:
                    break
