-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 20-03-2021 a las 03:17:21
-- Versión del servidor: 8.0.23
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `id_articulo` int NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio_venta` int NOT NULL,
  `precio_costo` int NOT NULL,
  `stock` int NOT NULL,
  `cod_tipo_articulo` int NOT NULL,
  `cod_proveedor` varchar(20) NOT NULL,
  `fecha_ingreso` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`id_articulo`, `descripcion`, `precio_venta`, `precio_costo`, `stock`, `cod_tipo_articulo`, `cod_proveedor`, `fecha_ingreso`) VALUES
(4, 'Zapatos', 120, 100, 6, 22, '00002-2', '01-01-2021'),
(5, 'Zapatos', 500, 300, 49, 21, '00001-1', '18-02-2021'),
(6, 'Zapatos', 900, 700, 9, 19, '00004-4', '12-04-2021'),
(8, 'Zapatos', 700, 500, 7, 20, '00004-4', '25-07-2021'),
(9, 'Zapatos', 600, 300, 20, 23, '00002-2', '04-08-2021'),
(10, 'Zapatos', 600, 300, 15, 23, '00002-2', '28-09-2021'),
(11, 'Zapatos', 800, 400, 19, 22, '00002-2', '10-11-2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `balance`
--

CREATE TABLE `balance` (
  `Balance_general` varchar(30) NOT NULL,
  `Activos` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `balance`
--

INSERT INTO `balance` (`Balance_general`, `Activos`) VALUES
('Banco', '3000'),
('Caja chica', '2000'),
('Cuentas por cobrar', '15000'),
('Maquinaria y equipo', '5000'),
('Mercaderia', '50000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `Codigo_ciudad` int NOT NULL,
  `Nombre_ciudad` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`Codigo_ciudad`, `Nombre_ciudad`) VALUES
(1, 'QUETZALTENANGO'),
(2, 'QUETZALTENANGO'),
(3, 'QUETZALTENANGO'),
(4, 'QUETZALTENANGO'),
(5, 'QUETZALTENANGO'),
(6, 'QUETZALTENANGO'),
(7, 'QUETZALTENANGO'),
(8, 'QUETZALTENANGO'),
(9, 'QUETZALTENANGO'),
(10, 'QUETZALTENANGO'),
(11, 'QUETZALTENANGO'),
(12, 'QUETZALTENANGO'),
(13, 'QUETZALTENANGO'),
(14, 'QUETZALTENANGO'),
(15, 'QUETZALTENANGO'),
(16, 'QUETZALTENANGO'),
(17, 'QUETZALTENANGO'),
(18, 'QUETZALTENANGO'),
(19, 'QUETZALTENANGO'),
(20, 'QUETZALTENANGO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Documento` varchar(15) NOT NULL,
  `cod_tipo_documento` int NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int NOT NULL,
  `Telefono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Documento`, `cod_tipo_documento`, `Nombres`, `Apellidos`, `Direccion`, `cod_ciudad`, `Telefono`) VALUES
('000031', 1, 'Carlos', 'Perez', 'Ciudad', 1, '32669874'),
('0001', 1, 'Camilo', 'Lopez', 'Calle 23 N 12-43', 2, '82395787'),
('0002', 2, 'Maria', 'Arango', 'Ciudad', 1, '22993448'),
('0003', 1, 'Andres', 'Florez', 'Ciudad', 4, '31276543'),
('0004', 1, 'Carlos', 'Marin', 'Calle 3 N 98_21', 10, '83456237'),
('0005', 1, 'Elvira', 'Orozco', 'Ciudad', 15, '32198456'),
('0006', 1, 'Kevin', 'Ayala', 'Ciudad', 1, '83546242'),
('0007', 1, 'Angela', 'Hoyos', 'Calle 4 N 23 34', 3, '32176543'),
('0008', 2, 'Marcela', 'Gomez', 'Ciudad', 6, '56148795'),
('0009', 1, 'Andres', 'Orozco', 'Calle 34 N 89 00', 1, '82198761'),
('0010', 1, 'Marlon', 'Diaz', 'Ciudad', 9, '33665544'),
('0011', 1, 'Daniela', 'Ceron', 'Ciudad', 1, '22365438'),
('0012', 2, 'Camilo', 'Orozco', 'Calle 21 N 23-98', 10, '31198745'),
('0013', 1, 'Daniela', 'Ramos', 'Ciudad', 2, '32176534'),
('0014', 2, 'Camilo', 'Samboni', 'Ciudad', 6, '82045871'),
('0015', 1, 'Alexander', 'Romero', 'Calle 34 N 23 B 12', 2, '83409762'),
('0016', 1, 'Sebastian', 'Naranjo', 'Ciudad', 1, '83209121'),
('0017', 2, 'Sandra', 'Castillo', 'Ciudad', 3, '32187678'),
('0018', 1, 'Nicolas', 'Ospina', 'Calle 23- N 76', 1, '82309542'),
('0019', 1, 'Santiago', 'Sanchez', 'Ciudad', 1, '82365218'),
('0020', 1, 'Aleja', 'Dorado', 'Calle 34 N 23 B 4', 2, '84532343'),
('0023', 1, 'Dolly', 'Joaqui', 'Calle 3 N 34-12', 1, '82309433'),
('0024', 2, 'Kevin', 'Rivera', 'Ciudad', 1, '33423097'),
('0025', 1, 'Camila', 'Maya', 'Carrera 23 n 65-4', 1, '3150987866'),
('0026', 1, 'Camilo', 'Coral', 'Centro', 1, NULL),
('0027', 2, 'Carlos', 'Paz', 'Centro', 1, NULL),
('0028', 1, 'Cristian', 'Paz', 'Calle 34 N b34', 1, '3219870045'),
('0029', 1, 'Daniela', 'Solarte', 'Centro', 1, '8345623'),
('0030', 1, 'Diana', 'Aponte', 'Centro', 15, '8234522'),
('22', 1, 'Juan', 'Velazques', 'Xela', 1, '44321245'),
('8855', 2, 'Gabriel', 'Granados', 'Quetzaltenango', 2, '51321321');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_factura`
--

CREATE TABLE `detalle_factura` (
  `cod_factura` varchar(20) NOT NULL,
  `cod_articulo` int NOT NULL,
  `cantidad` int NOT NULL,
  `total` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_factura`
--

INSERT INTO `detalle_factura` (`cod_factura`, `cod_articulo`, `cantidad`, `total`) VALUES
('FACT-7109888', 10, 2, '1200'),
('FACT-967779', 5, 10, '5000'),
('FACT-9910966', 4, 2, '240000'),
('FACT-9910966', 5, 1, '47500');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion`
--

CREATE TABLE `devolucion` (
  `cod_detallefactura` varchar(20) NOT NULL,
  `cod_detallearticulo` int NOT NULL,
  `Motivo` varchar(15) NOT NULL,
  `Fecha_devolucion` varchar(10) NOT NULL,
  `cantidad` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `Nnm_factura` varchar(20) NOT NULL,
  `cod_cliente` varchar(15) NOT NULL,
  `Nombre_empleado` varchar(30) NOT NULL,
  `Fecha_facturacion` varchar(15) NOT NULL,
  `cod_formapago` int NOT NULL,
  `total_factura` decimal(10,0) DEFAULT NULL,
  `IVA` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`Nnm_factura`, `cod_cliente`, `Nombre_empleado`, `Fecha_facturacion`, `cod_formapago`, `total_factura`, `IVA`) VALUES
('FACT-7109888', '8855', 'Bryan', '18/7/2020', 1, '1200', '60'),
('FACT-79710106', '0001', '', '19/3/2021', 2, NULL, NULL),
('FACT-967779', '22', 'Viviana', '18/3/2021', 1, '5000', '250'),
('FACT-96910810', '0001', '', '19/3/2021', 2, NULL, NULL),
('FACT-9910966', '0001', 'Carlos', '22/1/2020', 1, '400', '20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `financiero`
--

CREATE TABLE `financiero` (
  `Estado_resultado` varchar(30) NOT NULL,
  `Tipo` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `financiero`
--

INSERT INTO `financiero` (`Estado_resultado`, `Tipo`) VALUES
('costo_ventas', 2800),
('depeciacion', 0),
('gastos operativos', 0),
('impuestos', 0),
('intereses', 0),
('utilidades_antes_impuestos', 0),
('utilidad_antes_intereses_impue', 0),
('utilidad_bruta', 3200),
('utilidad_neta', 0),
('Ventas', 6000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `forma_de_pago`
--

CREATE TABLE `forma_de_pago` (
  `id_formapago` int NOT NULL,
  `Descripcion_formapago` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `forma_de_pago`
--

INSERT INTO `forma_de_pago` (`id_formapago`, `Descripcion_formapago`) VALUES
(1, 'EFECTIVO'),
(2, 'BONO'),
(3, 'TARJETA DE CREDITO'),
(4, 'CHEQUE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `No_documento` varchar(20) NOT NULL,
  `cod_tipo_documento` int NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Nombre_comercial` varchar(20) NOT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`No_documento`, `cod_tipo_documento`, `Nombre`, `Apellido`, `Nombre_comercial`, `direccion`, `cod_ciudad`, `Telefono`) VALUES
('00001-1', 4, 'Carlos', 'Maya', 'Modas y Textiles', 'Calle 12-12', 1, '53256985'),
('00002-2', 4, 'Marino', 'Burbano', 'Centro de Telas', 'Ciudad', 2, '22558810'),
('00004-4', 4, 'Camilo', 'muñoz', 'Enmarcadora la Centr', 'Ciudad', 2, '48494720');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rrhh`
--

CREATE TABLE `rrhh` (
  `Id_empleado` varchar(30) NOT NULL,
  `CUI` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Fecha_nacimiento` varchar(30) NOT NULL,
  `Telefono` varchar(30) NOT NULL,
  `Fecha_contrato` varchar(30) NOT NULL,
  `Genero` varchar(30) NOT NULL,
  `Estado_civil` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Cargo` varchar(30) NOT NULL,
  `Horario` varchar(30) NOT NULL,
  `Salario` varchar(30) NOT NULL,
  `Estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rrhh`
--

INSERT INTO `rrhh` (`Id_empleado`, `CUI`, `Apellidos`, `Nombre`, `Direccion`, `Fecha_nacimiento`, `Telefono`, `Fecha_contrato`, `Genero`, `Estado_civil`, `Email`, `Cargo`, `Horario`, `Salario`, `Estado`) VALUES
('33665', '897841460', 'Sandoval', 'Camilo', 'Xela', '03/11/1985', '77998877', '28/06/2020', 'Masculino', 'Soltero', 'sandov@hotmail.com', 'Supervisor', '3-10pm', '3500', 'Pendiente'),
('77854', '445587928', 'Gramajo', 'Leslie', 'Quetzaltenango', '14/08/1994', '44889967', '28/11/2014', 'Femenino', 'Soltera', 'lesliegram@gmail.com', 'Vendedora', '9-6pm', '3500', 'Activo'),
('77996', '559935417', 'Beyoda', 'Yessica', 'XELA', '26/89/2001', '5598651', '9/04/2014', 'Femenino', 'Soltera', 'yesi@hotmail.com', 'Gerente', '8-3pm', '7000', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_articulo`
--

CREATE TABLE `tipo_articulo` (
  `id_tipoarticulo` int NOT NULL,
  `descripcion_articulo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_articulo`
--

INSERT INTO `tipo_articulo` (`id_tipoarticulo`, `descripcion_articulo`) VALUES
(19, 'Zapato Formal'),
(20, 'Zapato Deportivo'),
(21, 'Zapato Informal'),
(22, 'Calzado de Proteccion'),
(23, 'Botas'),
(24, 'Sandalias');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_documento`
--

CREATE TABLE `tipo_de_documento` (
  `id_tipo_documento` int NOT NULL,
  `Descripcion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_de_documento`
--

INSERT INTO `tipo_de_documento` (`id_tipo_documento`, `Descripcion`) VALUES
(1, 'CUI'),
(2, 'CUI'),
(4, 'NIT'),
(5, 'PASAPORTE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int NOT NULL,
  `nick` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `tipousuario` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nick`, `password`, `tipousuario`) VALUES
(1, 'Rodolfo', '1234', 'Administrador'),
(2, 'Edvin', '1234', 'Administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`id_articulo`),
  ADD KEY `ref_tipo_articulo_idx` (`cod_tipo_articulo`),
  ADD KEY `ref_prov_art_idx` (`cod_proveedor`);

--
-- Indices de la tabla `balance`
--
ALTER TABLE `balance`
  ADD PRIMARY KEY (`Balance_general`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`Codigo_ciudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Documento`),
  ADD KEY `cod_tipodocumento_idx` (`cod_tipo_documento`),
  ADD KEY `ref_ciudad_idx` (`cod_ciudad`);

--
-- Indices de la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD PRIMARY KEY (`cod_factura`,`cod_articulo`),
  ADD KEY `ref_facturacion_idx` (`cod_factura`),
  ADD KEY `ref_ar_fact_idx` (`cod_articulo`);

--
-- Indices de la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD PRIMARY KEY (`cod_detallefactura`,`cod_detallearticulo`),
  ADD KEY `ref_detallefactu_idx` (`cod_detallefactura`),
  ADD KEY `ref_deta_art_idx` (`cod_detallearticulo`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`Nnm_factura`),
  ADD KEY `ref_cli_idx` (`cod_cliente`),
  ADD KEY `ref_formapago_idx` (`cod_formapago`);

--
-- Indices de la tabla `financiero`
--
ALTER TABLE `financiero`
  ADD PRIMARY KEY (`Estado_resultado`);

--
-- Indices de la tabla `forma_de_pago`
--
ALTER TABLE `forma_de_pago`
  ADD PRIMARY KEY (`id_formapago`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`No_documento`),
  ADD KEY `ref_prov_ciudad_idx` (`cod_ciudad`),
  ADD KEY `proveedor_ibfk_1` (`cod_tipo_documento`);

--
-- Indices de la tabla `rrhh`
--
ALTER TABLE `rrhh`
  ADD PRIMARY KEY (`Id_empleado`);

--
-- Indices de la tabla `tipo_articulo`
--
ALTER TABLE `tipo_articulo`
  ADD PRIMARY KEY (`id_tipoarticulo`);

--
-- Indices de la tabla `tipo_de_documento`
--
ALTER TABLE `tipo_de_documento`
  ADD PRIMARY KEY (`id_tipo_documento`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
  MODIFY `id_articulo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `Codigo_ciudad` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `forma_de_pago`
--
ALTER TABLE `forma_de_pago`
  MODIFY `id_formapago` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tipo_articulo`
--
ALTER TABLE `tipo_articulo`
  MODIFY `id_tipoarticulo` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `tipo_de_documento`
--
ALTER TABLE `tipo_de_documento`
  MODIFY `id_tipo_documento` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD CONSTRAINT `ref_prov_art` FOREIGN KEY (`cod_proveedor`) REFERENCES `proveedor` (`No_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_tipo_articulo` FOREIGN KEY (`cod_tipo_articulo`) REFERENCES `tipo_articulo` (`id_tipoarticulo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `ref_ciudad` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_tipo_doc` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_factura`
--
ALTER TABLE `detalle_factura`
  ADD CONSTRAINT `ref_ar_fact` FOREIGN KEY (`cod_articulo`) REFERENCES `articulo` (`id_articulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_facturacion` FOREIGN KEY (`cod_factura`) REFERENCES `factura` (`Nnm_factura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD CONSTRAINT `ref_deta_art` FOREIGN KEY (`cod_detallearticulo`) REFERENCES `detalle_factura` (`cod_articulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_detallefactu` FOREIGN KEY (`cod_detallefactura`) REFERENCES `detalle_factura` (`cod_factura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `ref_cli` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`Documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_formapago` FOREIGN KEY (`cod_formapago`) REFERENCES `forma_de_pago` (`id_formapago`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_prov_ciudad` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
