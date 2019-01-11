import subprocess
import re;

# Recebe uma lista devolve uma str
def buscarNoPc(lista):
    retornoByte = subprocess.check_output(lista)
    retornoTexto = retornoByte.decode('utf-8')
    return retornoTexto

def montarLista():
    listaComando = {}
    ipconfig = buscarNoPc(['ifconfig'])
    listaComando['ip'] = re.findall('(?<=inet ).*(?= netmask)', ipconfig)[0]
    listaComando['Mascara'] = re.findall('(?<=netmask\s)\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3}', ipconfig)[0]
    listaComando['Gateway'] = re.findall('(?<=broadcast\s)\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3}(?=\n)', ipconfig)[0]
    listaComando['O nome do host'] = re.findall('.*(?=\n)', buscarNoPc(['hostname']))[0]
    listaComando['Nome da distribuicao'] = re.findall('(?<=#\d\d-).*(?= SMP)', buscarNoPc(['uname', '-a']))[0]
    cpuinfo = buscarNoPc(['cat', '/proc/cpuinfo'])
    listaComando['Frequencia'] = re.findall('(?<=\ncpu MHz\t\t: )[^\n]+(?=\ncache)', cpuinfo)[0]
    listaComando['Qunatidade memoria cache'] = re.findall('(?<=\ncache size\t: )[^\n]+(?=\nphysical)', cpuinfo)[0]
    listaComando['Quantidade memoria RAM'] = re.findall('\d+,\d+G(?=\s)', buscarNoPc(['free', '-h']))[0]
    aux = re.findall('/run\n[A-Za-z\d/]+\s+\d+G', buscarNoPc(['df', '-h']))[0]
    listaComando['Quantidade memoria HD'] = re.findall('\d+G', aux)[0]
    return listaComando

print(montarLista())




    

