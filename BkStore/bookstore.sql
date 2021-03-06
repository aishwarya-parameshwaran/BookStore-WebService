USE [master]
GO
/****** Object:  Table [dbo].[bought]    Script Date: 01/18/2016 10:18:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[bought](
	[custname] [varchar](50) NULL,
	[address] [varchar](150) NULL,
	[contact] [numeric](10, 0) NULL,
	[bookid] [numeric](5, 0) NULL,
	[bkname] [varchar](100) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[books]    Script Date: 01/18/2016 10:18:44 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[books](
	[name] [varchar](100) NULL,
	[author] [varchar](100) NULL,
	[bookid] [numeric](10, 0) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
