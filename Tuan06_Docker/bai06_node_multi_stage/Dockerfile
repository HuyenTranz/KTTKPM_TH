# --------- Stage 1: Build ---------
FROM node:18 AS build

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy file cấu hình và cài đặt dependencies
COPY package.json ./
RUN npm install

# Copy toàn bộ code vào image
COPY . .

# Bỏ lệnh build vì Express không cần build
# RUN npm run build

# --------- Stage 2: Production ---------
FROM node:18-alpine

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy file cần thiết từ stage build
COPY --from=build /app /app

# Mở cổng ứng dụng
EXPOSE 3000

# Lệnh chạy ứng dụng
CMD ["npm", "start"]
