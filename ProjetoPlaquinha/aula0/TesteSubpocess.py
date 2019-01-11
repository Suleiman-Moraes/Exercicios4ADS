import subprocess

out = subprocess.check_output(['ipconfig'])
print(out)
# sys.stdout = open(sys.stdout.buffer.fileno(), 'w', encoding='utf8')
texto = "nada"
texto = out.decode('utf-16')
# print(texto , "")
texto