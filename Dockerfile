# Usando uma imagem base do Node.js
FROM node:14

# Criar e definir o diretório de trabalho dentro do container
WORKDIR /usr/src/app

# Copiar o package.json e o package-lock.json para o container
COPY package*.json ./

# Instalar as dependências do projeto
RUN npm install

# Copiar o restante dos arquivos do projeto
COPY . .

# Expor a porta 3000 para acessar a aplicação
EXPOSE 3000

# Definir o comando para rodar o app
CMD ["npm", "start"]
