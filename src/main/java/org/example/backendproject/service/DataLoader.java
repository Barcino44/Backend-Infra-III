package org.example.backendproject.service;

import org.example.backendproject.Entity.Product;
import org.example.backendproject.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    private final ProductRepository productRepository;
    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            productRepository.deleteAll();
            productRepository.save(new Product(
                    "Laptop HP",
                    799.99,
                    "Laptop HP con procesador Intel Core i5 de 11ª generación, 8GB de memoria RAM DDR4, unidad de estado sólido (SSD) de 256GB para un arranque rápido.",
                    "/images/PCGamer.jpg"
            ));

            productRepository.save(new Product(
                    "PlayStation 5",
                    599.99,
                    "La nueva consola PlayStation 5 de Sony redefine la experiencia de juego con su potente procesador AMD Ryzen Zen 2 de 8 núcleos y su GPU RDNA 2.",
                    "/images/PS5.jpg"
            ));

            productRepository.save(new Product(
                    "Auriculares Sony",
                    149.99,
                    "Auriculares inalámbricos Sony WH-1000XM4 con tecnología líder de cancelación de ruido activa, sonido de alta resolución, conectividad Bluetooth multipunto.",
                    "/images/SonyAirpods.jpg"
            ));

            productRepository.save(new Product(
                    "Monitor LG",
                    249.99,
                    "Monitor LG UltraFine de 27 pulgadas con resolución 4K UHD (3840x2160), panel IPS para colores precisos y ángulos de visión amplios, compatibilidad con HDR10.",
                    "/images/MonitorLG.jpg"
            ));

            productRepository.save(new Product(
                    "Teclado Mecánico",
                    89.99,
                    "Teclado mecánico para gaming con switches Red de alta respuesta, retroiluminación RGB personalizable con múltiples efectos de luz, construcción resistente con placa de metal.",
                    "/images/Teclado.jpg"
            ));

            productRepository.save(new Product(
                    "Mouse Inalámbrico",
                    39.99,
                    "Mouse inalámbrico ergonómico con sensor óptico de alta precisión (1600 DPI), conectividad por dongle USB 2.4GHz, diseño contorneado para mayor comodidad.",
                    "/images/Mouse.png"
            ));

            productRepository.save(new Product(
                    "Tableta Gráfica",
                    199.99,
                    "Tableta gráfica profesional con superficie activa de 10x6 pulgadas, lápiz óptico sin batería con 8192 niveles de presión, 8 teclas de acceso rápido programables.",
                    "/images/Tableta.jpg"
            ));

            productRepository.save(new Product(
                    "Disco Duro Externo",
                    119.99,
                    "Disco duro externo portátil con capacidad de almacenamiento de 2TB, interfaz USB 3.0 para transferencia rápida de datos, carcasa resistente a impactos.",
                    "/images/DiscoDuro.jpg"
            ));
            productRepository.save(new Product(
                    "Impresora EPSON",
                    299.99,
                    "Impresora multifuncional láser a color con funciones de impresión, escaneo y copiado, velocidad de impresión de hasta 22 ppm, de alto rendimiento.",
                    "/images/Impresora.jpg"
            ));
        };
    }
}
