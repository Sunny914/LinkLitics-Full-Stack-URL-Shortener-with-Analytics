# 🔗 LinkLitics – Full-Stack URL Shortener with Analytics  

## 📖 Detailed Description  
**LinkLitics** is a **full-stack URL shortener** that not only shortens long URLs but also provides **real-time analytics and insights** on link usage. It is designed to be **secure, scalable, and production-ready**, making it ideal for businesses, developers, and marketers who want to **track user engagement and optimize their links**.  

This project demonstrates **end-to-end application development** using **Spring Boot (backend)**, **React.js (frontend)**, and **PostgreSQL database**, along with **Docker-based containerization** and **cloud deployment**. The system includes:  
- **JWT-secured authentication** to protect user data and dashboards  
- **Advanced analytics** such as **click counts, referrer tracking, device type, and timestamp-based trends**  
- **Responsive and user-friendly UI** for seamless user experience  
- **Cloud deployment** for real-world usage (Render for backend, Netlify for frontend, Neon PostgreSQL for database)  

With **LinkLitics**, users can:  
✔ Create shortened URLs with custom aliases  
✔ Monitor click performance with real-time charts  
✔ Manage their links through a secure dashboard  
✔ Deploy the solution in a production environment using **Docker**  

---

## ✅ Features  
- **Shortened URLs** with path & subdomain routing  
- **Real-time analytics dashboards** (per-URL & account-wide) using **Chart.js**  
- **Secure authentication** with **JWT** & protected routes  
- **Responsive React frontend** using **Vite, Material UI, Tailwind**  
- **Backend deployed on Render**, **Frontend on Netlify**, **Dockerized services**  

---

## 🛠 Tech Stack  
**Backend:** Spring Boot, Spring Security, Spring Data JPA  
**Frontend:** React.js, Vite, Material UI, Tailwind CSS, React Query, Axios, React Hook Form  
**Analytics:** Chart.js  
**Database:** PostgreSQL (Neon)  
**Deployment:** Docker, Render, Netlify  

---

## 📐 Architecture  
```mermaid
flowchart TD
    A[React Frontend] -->|Axios Requests| B[API Gateway / Spring Boot Backend]
    B -->|REST APIs| C[PostgreSQL Database]
    B -->|Auth & JWT| D[Spring Security]
    B -->|Analytics Data| E[Chart.js Visualization]
