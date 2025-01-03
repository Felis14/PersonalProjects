USE [master]
GO
/****** Object:  Database [CreditosF]    Script Date: 8/27/2023 11:43:33 PM ******/
CREATE DATABASE [CreditosF]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CreditosF', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\CreditosF.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CreditosF_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\CreditosF_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [CreditosF] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CreditosF].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CreditosF] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CreditosF] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CreditosF] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CreditosF] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CreditosF] SET ARITHABORT OFF 
GO
ALTER DATABASE [CreditosF] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CreditosF] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CreditosF] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CreditosF] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CreditosF] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CreditosF] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CreditosF] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CreditosF] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CreditosF] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CreditosF] SET  ENABLE_BROKER 
GO
ALTER DATABASE [CreditosF] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CreditosF] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CreditosF] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CreditosF] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CreditosF] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CreditosF] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CreditosF] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CreditosF] SET RECOVERY FULL 
GO
ALTER DATABASE [CreditosF] SET  MULTI_USER 
GO
ALTER DATABASE [CreditosF] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CreditosF] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CreditosF] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CreditosF] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CreditosF] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CreditosF] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'CreditosF', N'ON'
GO
ALTER DATABASE [CreditosF] SET QUERY_STORE = ON
GO
ALTER DATABASE [CreditosF] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [CreditosF]
GO
/****** Object:  Table [dbo].[Bitacora]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bitacora](
	[NumMov] [int] IDENTITY(1,1) NOT NULL,
	[FechaMov] [date] NOT NULL,
	[Descripcion] [varchar](40) NOT NULL,
	[Usuario] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[NumMov] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Clientes]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clientes](
	[ID] [int] NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Tel] [varchar](20) NOT NULL,
	[Dir] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[FechaReg] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cuentas]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cuentas](
	[NumCuenta] [int] NOT NULL,
	[FechaAper] [date] NOT NULL,
	[Estado] [varchar](15) NOT NULL,
	[SaldoAPagar] [float] NOT NULL,
	[MontoLimite] [float] NOT NULL,
	[MontoDispo] [float] NOT NULL,
	[ID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[NumCuenta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Funciones]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Funciones](
	[CodeFun] [varchar](5) NOT NULL,
	[NameFun] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CodeFun] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[FuncionNivel]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FuncionNivel](
	[CodeNivFun] [varchar](10) NOT NULL,
	[CodeNiv] [varchar](5) NOT NULL,
	[CodeFun] [varchar](5) NOT NULL,
	[Estado] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CodeNivFun] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Movimientos]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Movimientos](
	[NumCuenta] [int] NOT NULL,
	[FechaMov] [date] NOT NULL,
	[TipoMov] [varchar](10) NOT NULL,
	[MontoMov] [float] NOT NULL,
	[NombreDelResp] [varchar](50) NOT NULL,
	[Detalle] [varchar](50) NOT NULL,
	[NumMov] [int] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[NumMov] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Niveles]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Niveles](
	[CodeNiv] [varchar](5) NOT NULL,
	[NameNiv] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CodeNiv] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuarios]    Script Date: 8/27/2023 11:43:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuarios](
	[ID] [int] NOT NULL,
	[Nombre] [varchar](25) NOT NULL,
	[Apellidos] [varchar](50) NOT NULL,
	[FechaReg] [date] NOT NULL,
	[Username] [varchar](20) NOT NULL,
	[Contra] [varchar](20) NOT NULL,
	[NivelUsuario] [varchar](10) NOT NULL,
	[Estado] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Bitacora] ON 

INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (11, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (13, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'calek')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (14, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'calek')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (15, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'jos26')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (16, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'jos26')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (17, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (18, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (19, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (20, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (21, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (22, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (23, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (24, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (25, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (26, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (27, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (28, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (29, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (30, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (31, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (32, CAST(N'2023-08-27' AS Date), N'Registró la cuenta: 12', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (33, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (34, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (35, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 12', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (36, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 13', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (37, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 14', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (38, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 15', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (39, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (40, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (41, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 16', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (42, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 17', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (43, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (44, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (45, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (46, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (47, CAST(N'2023-08-27' AS Date), N'Registró el movimiento: 18', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (48, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (49, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (50, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (51, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (52, CAST(N'2023-08-27' AS Date), N'Anuló el movimiento: 18', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (53, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (54, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (55, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (56, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (57, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (58, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (59, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (60, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (61, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (62, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (63, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (64, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (65, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (66, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (67, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (68, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (69, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (70, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (71, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (72, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (73, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (74, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (75, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (76, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (77, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (78, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (79, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (80, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (81, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (82, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (83, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (84, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (85, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (86, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (87, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (88, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (89, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (90, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (91, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (92, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (93, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (94, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (95, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (96, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (97, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (98, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (99, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (100, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (101, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (102, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (103, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (104, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (105, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (106, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (107, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (108, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (109, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
GO
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (110, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (111, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (112, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (113, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (114, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (115, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (116, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (117, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (118, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (119, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (120, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'root')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (121, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (122, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (123, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (124, CAST(N'2023-08-27' AS Date), N'Cambió el estado del usuario: jos26', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (125, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (126, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'jos26')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (127, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'jos26')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (128, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'calek')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (129, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'calek')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (130, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (131, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'notzero')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (132, CAST(N'2023-08-27' AS Date), N'Inicio Sesión', N'felix')
INSERT [dbo].[Bitacora] ([NumMov], [FechaMov], [Descripcion], [Usuario]) VALUES (133, CAST(N'2023-08-27' AS Date), N'Cerró Sesión', N'felix')
SET IDENTITY_INSERT [dbo].[Bitacora] OFF
GO
INSERT [dbo].[Clientes] ([ID], [Nombre], [Tel], [Dir], [Email], [FechaReg]) VALUES (1, N'Félix Barboza Soto', N'8430-2928', N'Moravia, San Vicente', N'felixsoto148@gmail.com', CAST(N'2023-08-02' AS Date))
INSERT [dbo].[Clientes] ([ID], [Nombre], [Tel], [Dir], [Email], [FechaReg]) VALUES (11, N'Alfredo Rodríguez Altamirano', N'1111-1111', N'Goicochea, Guadalupe', N'alfredspx@gmail.com', CAST(N'2023-08-22' AS Date))
GO
INSERT [dbo].[Cuentas] ([NumCuenta], [FechaAper], [Estado], [SaldoAPagar], [MontoLimite], [MontoDispo], [ID]) VALUES (2, CAST(N'2023-08-24' AS Date), N'Activa', 80000, 1500000, 802500, 11)
INSERT [dbo].[Cuentas] ([NumCuenta], [FechaAper], [Estado], [SaldoAPagar], [MontoLimite], [MontoDispo], [ID]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Activa', 0, 1000000, 1000000, 1)
INSERT [dbo].[Cuentas] ([NumCuenta], [FechaAper], [Estado], [SaldoAPagar], [MontoLimite], [MontoDispo], [ID]) VALUES (14, CAST(N'2023-08-02' AS Date), N'Activa', 75000, 1200000, 410000, 1)
GO
INSERT [dbo].[Funciones] ([CodeFun], [NameFun]) VALUES (N'00', N'Gestion Clientes')
INSERT [dbo].[Funciones] ([CodeFun], [NameFun]) VALUES (N'01', N'Gestion Usuarios')
INSERT [dbo].[Funciones] ([CodeFun], [NameFun]) VALUES (N'02', N'Reportes Clientes')
INSERT [dbo].[Funciones] ([CodeFun], [NameFun]) VALUES (N'03', N'Reportes Usuarios')
INSERT [dbo].[Funciones] ([CodeFun], [NameFun]) VALUES (N'04', N'Reportes Bitacora')
GO
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0000', N'00', N'00', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0001', N'00', N'01', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0002', N'00', N'02', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0003', N'00', N'03', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0004', N'00', N'04', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0100', N'01', N'00', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0101', N'01', N'01', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0102', N'01', N'02', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0103', N'01', N'03', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0104', N'01', N'04', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0200', N'02', N'00', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0201', N'02', N'01', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0202', N'02', N'02', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0203', N'02', N'03', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0204', N'02', N'04', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0300', N'03', N'00', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0301', N'03', N'01', N'N')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0302', N'03', N'02', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0303', N'03', N'03', N'S')
INSERT [dbo].[FuncionNivel] ([CodeNivFun], [CodeNiv], [CodeFun], [Estado]) VALUES (N'0304', N'03', N'04', N'S')
GO
SET IDENTITY_INSERT [dbo].[Movimientos] ON 

INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-22' AS Date), N'Abono', 2500, N'El', N'Regalo', 3)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-22' AS Date), N'Abono', 2500, N'Pepe', N'Regalo', 4)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-22' AS Date), N'Abono', 5000, N'Pepe', N'Deuda', 5)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-22' AS Date), N'Compra', 2500, N'Felix', N'Compra Steam', 6)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-24' AS Date), N'Compra', 7500, N'Yo', N'Taquito Bell', 7)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (14, CAST(N'2023-08-24' AS Date), N'Compra', 5000, N'Yo', N'Taquito Bell', 8)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (2, CAST(N'2023-08-26' AS Date), N'Abono', 2500, N'Alicia', N'Regalito', 11)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Compra', 5000, N'Yo', N'Taquito Bell', 12)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Abono', 5000, N'Yo', N'Abono', 13)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Abono', 1000, N'Yo', N'Abono', 14)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Compra', 1000, N'Yo', N'Pachita Guaro Mil', 15)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Abono', 1000, N'Yo', N'Abono', 16)
INSERT [dbo].[Movimientos] ([NumCuenta], [FechaMov], [TipoMov], [MontoMov], [NombreDelResp], [Detalle], [NumMov]) VALUES (12, CAST(N'2023-08-27' AS Date), N'Compra', 1000, N'Nadie', N'Nada', 17)
SET IDENTITY_INSERT [dbo].[Movimientos] OFF
GO
INSERT [dbo].[Niveles] ([CodeNiv], [NameNiv]) VALUES (N'00', N'Administrador')
INSERT [dbo].[Niveles] ([CodeNiv], [NameNiv]) VALUES (N'01', N'Operador')
INSERT [dbo].[Niveles] ([CodeNiv], [NameNiv]) VALUES (N'02', N'Soporte')
INSERT [dbo].[Niveles] ([CodeNiv], [NameNiv]) VALUES (N'03', N'Analista')
GO
INSERT [dbo].[Usuarios] ([ID], [Nombre], [Apellidos], [FechaReg], [Username], [Contra], [NivelUsuario], [Estado]) VALUES (112345214, N'Caleb', N'Barboza Soto', CAST(N'2023-08-27' AS Date), N'calek', N'quixote2', N'01', N'Activo')
INSERT [dbo].[Usuarios] ([ID], [Nombre], [Apellidos], [FechaReg], [Username], [Contra], [NivelUsuario], [Estado]) VALUES (119420927, N'Félix', N'Barboza Soto', CAST(N'2023-08-27' AS Date), N'felix', N'phoenix', N'00', N'Activo')
INSERT [dbo].[Usuarios] ([ID], [Nombre], [Apellidos], [FechaReg], [Username], [Contra], [NivelUsuario], [Estado]) VALUES (125420285, N'Josue', N'Ocampo Soto', CAST(N'2023-08-27' AS Date), N'jos26', N'anubishimself666', N'03', N'Activo')
INSERT [dbo].[Usuarios] ([ID], [Nombre], [Apellidos], [FechaReg], [Username], [Contra], [NivelUsuario], [Estado]) VALUES (103256841, N'Isaac', N'Arce Espinoza', CAST(N'2023-08-27' AS Date), N'notzero', N'alonegonenow6', N'02', N'Activo')
INSERT [dbo].[Usuarios] ([ID], [Nombre], [Apellidos], [FechaReg], [Username], [Contra], [NivelUsuario], [Estado]) VALUES (502640081, N'Mario', N'Gomez Moraga', CAST(N'2023-08-27' AS Date), N'root', N'root', N'00', N'Activo')
GO
ALTER TABLE [dbo].[Cuentas]  WITH CHECK ADD FOREIGN KEY([ID])
REFERENCES [dbo].[Clientes] ([ID])
GO
ALTER TABLE [dbo].[FuncionNivel]  WITH CHECK ADD FOREIGN KEY([CodeFun])
REFERENCES [dbo].[Funciones] ([CodeFun])
GO
ALTER TABLE [dbo].[FuncionNivel]  WITH CHECK ADD FOREIGN KEY([CodeNiv])
REFERENCES [dbo].[Niveles] ([CodeNiv])
GO
ALTER TABLE [dbo].[Movimientos]  WITH CHECK ADD FOREIGN KEY([NumCuenta])
REFERENCES [dbo].[Cuentas] ([NumCuenta])
GO
USE [master]
GO
ALTER DATABASE [CreditosF] SET  READ_WRITE 
GO
