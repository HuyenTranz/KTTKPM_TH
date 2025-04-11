# Stage 1: Build React App
FROM node:16 AS build

WORKDIR /app
COPY react-app/package.json react-app/package-lock.json ./
RUN npm install
COPY react-app .
RUN npm run build

# Stage 2: Serve with Nginx
FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

# Copy custom nginx config nếu muốn (mặc định thì dùng config chuẩn)
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
