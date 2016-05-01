USE [trazaweb]
GO
/****** Object:  Table [trazaweb].[TZ_USUARIO]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_USUARIO](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[NOMBRE] [varchar](255) NULL,
	[PASSWORD] [varchar](255) NULL,
	[HASH_PWD] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_TRANSACCION]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_TRANSACCION](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[CODIGO_TRANSACCION] [varchar](255) NULL,
	[FECHA_TRANSACCION] [datetime] NULL,
	[ESTADO] [varchar](255) NOT NULL
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_TIPO_AGENTE]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_TIPO_AGENTE](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[DESCRIPCION] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_ERROR]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_ERROR](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[CODIGO_ERROR] [varchar](255) NULL,
	[DETALLE_ERROR] [varchar](255) NULL,
	[FECHA] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_MEDICAMENTO]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_MEDICAMENTO](
	[GTIN] [varchar](255) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[FORMA] [varchar](255) NOT NULL,
	[PRESENTACION] [varchar](255) NOT NULL,
	[NOMBRE] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[GTIN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_AGENTE]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_AGENTE](
	[GLN] [varchar](255) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[CUIT] [varchar](255) NOT NULL,
	[DESCRIPCION] [varchar](255) NOT NULL,
	[ID_TIPO_ENTIDAD] [numeric](19, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[GLN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ID_TIPO_ENTIDAD] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_EVENTO]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_EVENTO](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[CODIGO] [int] NOT NULL,
	[DESCRIPCION] [varchar](255) NOT NULL,
	[ID_TIPO_AGENTE_INFORMANTE] [numeric](19, 0) NOT NULL,
	[ID_TIPO_AGENTE_ORIGEN] [numeric](19, 0) NOT NULL,
	[ID_TIPO_AGENTE_DESTINO] [numeric](19, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ID_TIPO_AGENTE_DESTINO] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ID_TIPO_AGENTE_ORIGEN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[ID_TIPO_AGENTE_INFORMANTE] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_ERROR_TRANSACCION]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [trazaweb].[TZ_ERROR_TRANSACCION](
	[ID_TRANSACCION] [numeric](19, 0) NOT NULL,
	[ID_ERROR] [numeric](19, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID_TRANSACCION] ASC,
	[ID_ERROR] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [trazaweb].[TZ_MOVIMIENTO]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_MOVIMIENTO](
	[ID] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[PERSISTENT_VERSION] [numeric](19, 0) NOT NULL,
	[ESTADO] [varchar](255) NOT NULL,
	[EDICION] [varchar](255) NOT NULL,
	[FECHA_EVENTO] [datetime] NULL,
	[HORA_EVENTO] [datetime] NULL,
	[NRO_REMITO] [numeric](19, 0) NULL,
	[NRO_FACTURA] [numeric](19, 0) NULL,
	[ID_ENTIDAD_ORIGEN] [varchar](255) NOT NULL,
	[ID_ENTIDAD_DESTINO] [varchar](255) NULL,
	[ID_EVENTO] [numeric](19, 0) NOT NULL,
	[APELLIDO] [varchar](255) NULL,
	[NOMBRES] [varchar](255) NULL,
	[TIPO_DOCUMENTO] [varchar](255) NULL,
	[N_DOCUMENTO] [varchar](255) NULL,
	[SEXO] [varchar](255) NULL,
	[DIRECCION] [varchar](255) NULL,
	[LOCALIDAD] [varchar](255) NULL,
	[NUMERO] [varchar](255) NULL,
	[PISO] [varchar](255) NULL,
	[DPTO] [varchar](255) NULL,
	[N_POSTAL] [varchar](255) NULL,
	[TELEFONO] [varchar](255) NULL,
	[ID_OBRA_SOCIAL] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_ENVIO]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [trazaweb].[TZ_ENVIO](
	[ID] [numeric](19, 0) NOT NULL,
	[FECHA_VENCIMIENTO] [datetime] NULL,
	[NRO_LOTE] [varchar](255) NULL,
	[NRO_SERIAL] [varchar](255) NULL,
	[ID_MEDICAMENTO] [varchar](255) NOT NULL,
	[ID_MOVIMIENTO] [numeric](19, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [trazaweb].[TZ_CANCELACION]    Script Date: 11/13/2012 14:07:36 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [trazaweb].[TZ_CANCELACION](
	[ID] [numeric](19, 0) NOT NULL,
	[ID_ENVIO_CANCELADO] [numeric](19, 0) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  ForeignKey [FK400241D94A085002]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_AGENTE]  WITH CHECK ADD  CONSTRAINT [FK_AGENTE__TIPO_AGENTE] FOREIGN KEY([ID_TIPO_ENTIDAD])
REFERENCES [trazaweb].[TZ_TIPO_AGENTE] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_AGENTE] CHECK CONSTRAINT [FK_AGENTE__TIPO_AGENTE]
GO
/****** Object:  ForeignKey [FKF47DB213925F2489]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_CANCELACION]  WITH CHECK ADD  CONSTRAINT [FK_CANCELACION__ENVIO] FOREIGN KEY([ID_ENVIO_CANCELADO])
REFERENCES [trazaweb].[TZ_ENVIO] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_CANCELACION] CHECK CONSTRAINT [FK_CANCELACION__ENVIO]
GO
/****** Object:  ForeignKey [FKF47DB213957ADC7C]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_CANCELACION]  WITH CHECK ADD  CONSTRAINT [FK_CANCELACION__TRANSACCION] FOREIGN KEY([ID])
REFERENCES [trazaweb].[TZ_TRANSACCION] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_CANCELACION] CHECK CONSTRAINT [FK_CANCELACION__TRANSACCION]
GO
/****** Object:  ForeignKey [FK54E107BA14AB52DC]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_ENVIO]  WITH CHECK ADD  CONSTRAINT [FK_ENVIO__MOVIMIENTO] FOREIGN KEY([ID])
REFERENCES [trazaweb].[TZ_MOVIMIENTO] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_ENVIO] CHECK CONSTRAINT [FK_ENVIO__MOVIMIENTO]
GO
/****** Object:  ForeignKey [FK54E107BA8218641C]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_ENVIO]  WITH CHECK ADD  CONSTRAINT [FK_ENVIO__MEDICAMENTO] FOREIGN KEY([ID_MEDICAMENTO])
REFERENCES [trazaweb].[TZ_MEDICAMENTO] ([GTIN])
GO
ALTER TABLE [trazaweb].[TZ_ENVIO] CHECK CONSTRAINT [FK_ENVIO__MEDICAMENTO]
GO
/****** Object:  ForeignKey [FK54E107BA957ADC7C]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_ENVIO]  WITH CHECK ADD  CONSTRAINT [FK_ENVIO__TRANSACCION] FOREIGN KEY([ID])
REFERENCES [trazaweb].[TZ_TRANSACCION] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_ENVIO] CHECK CONSTRAINT [FK_ENVIO__TRANSACCION]
GO
/****** Object:  ForeignKey [FKFC2FE71FBF2682CC]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_ERROR_TRANSACCION]  WITH CHECK ADD  CONSTRAINT [FK_ERROR_TRANSACCION__TRANSACCION] FOREIGN KEY([ID_TRANSACCION])
REFERENCES [trazaweb].[TZ_TRANSACCION] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_ERROR_TRANSACCION] CHECK CONSTRAINT [FK_ERROR_TRANSACCION__TRANSACCION]
GO
/****** Object:  ForeignKey [FKFC2FE71FEAC050E4]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_ERROR_TRANSACCION]  WITH CHECK ADD  CONSTRAINT [FK_ERROR_TRANSACCION__ERROR] FOREIGN KEY([ID_ERROR])
REFERENCES [trazaweb].[TZ_ERROR] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_ERROR_TRANSACCION] CHECK CONSTRAINT [FK_ERROR_TRANSACCION__ERROR]
GO
/****** Object:  ForeignKey [FK47A904EE2149AD22]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_EVENTO]  WITH CHECK ADD  CONSTRAINT [FK_EVENTO__TIPO_AGENTE_ORIGEN] FOREIGN KEY([ID_TIPO_AGENTE_ORIGEN])
REFERENCES [trazaweb].[TZ_TIPO_AGENTE] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_EVENTO] CHECK CONSTRAINT [FK_EVENTO__TIPO_AGENTE_ORIGEN]
GO
/****** Object:  ForeignKey [FK47A904EEC474BD90]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_EVENTO]  WITH CHECK ADD  CONSTRAINT [FK_EVENTO__TIPO_AGENTE_DESTINO] FOREIGN KEY([ID_TIPO_AGENTE_DESTINO])
REFERENCES [trazaweb].[TZ_TIPO_AGENTE] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_EVENTO] CHECK CONSTRAINT [FK_EVENTO__TIPO_AGENTE_DESTINO]
GO
/****** Object:  ForeignKey [FK47A904EEC600A8BF]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_EVENTO]  WITH CHECK ADD  CONSTRAINT [FK_EVENTO__TIPO_AGENTE_INFORMANTE] FOREIGN KEY([ID_TIPO_AGENTE_INFORMANTE])
REFERENCES [trazaweb].[TZ_TIPO_AGENTE] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_EVENTO] CHECK CONSTRAINT [FK_EVENTO__TIPO_AGENTE_INFORMANTE]
GO
/****** Object:  ForeignKey [FKF65C43EE2DC96FBA]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO]  WITH CHECK ADD  CONSTRAINT [FK_MOVIMIENTO__AGENTE_DESTINO] FOREIGN KEY([ID_ENTIDAD_DESTINO])
REFERENCES [trazaweb].[TZ_AGENTE] ([GLN])
GO
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO] CHECK CONSTRAINT [FK_MOVIMIENTO__AGENTE_DESTINO]
GO
/****** Object:  ForeignKey [FKF65C43EE53284E90]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO]  WITH CHECK ADD  CONSTRAINT [FK_MOVIMIENTO__AGENTE_ORIGEN] FOREIGN KEY([ID_ENTIDAD_ORIGEN])
REFERENCES [trazaweb].[TZ_AGENTE] ([GLN])
GO
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO] CHECK CONSTRAINT [FK_MOVIMIENTO__AGENTE_ORIGEN]
GO
/****** Object:  ForeignKey [FKF65C43EECD3BCCFA]    Script Date: 11/13/2012 14:07:36 ******/
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO]  WITH CHECK ADD  CONSTRAINT [FK_MOVIMIENTO__EVENTO] FOREIGN KEY([ID_EVENTO])
REFERENCES [trazaweb].[TZ_EVENTO] ([ID])
GO
ALTER TABLE [trazaweb].[TZ_MOVIMIENTO] CHECK CONSTRAINT [FK_MOVIMIENTO__EVENTO]
GO
