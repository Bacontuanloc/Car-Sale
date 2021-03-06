CREATE DATABASE THINHDEPTRAI
GO
USE [THINHDEPTRAI]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Account](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NOT NULL,
	[pass] [varchar](255) NOT NULL,
	[isAdmin] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Car]    Script Date: 7/14/2021 9:57:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Car](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](255) NOT NULL,
	[image] [nvarchar](max) NULL,
	[price] [int] NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[cateID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Category]    Script Date: 7/14/2021 9:57:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] NOT NULL,
	[cname] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Contact]    Script Date: 7/14/2021 9:57:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Contact](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[email] [varchar](255) NULL,
	[inbox] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 7/14/2021 9:57:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[oid] [int] NULL,
	[user] [varchar](255) NULL,
	[name] [nvarchar](255) NULL,
	[quantity] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ORDERS]    Script Date: 7/14/2021 9:57:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ORDERS](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[money] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([uID], [user], [pass], [isAdmin]) VALUES (1, N'monday', N'monday', 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isAdmin]) VALUES (4, N'moon', N'123456', 1)
INSERT [dbo].[Account] ([uID], [user], [pass], [isAdmin]) VALUES (3, N'sun', N'1234', 0)
INSERT [dbo].[Account] ([uID], [user], [pass], [isAdmin]) VALUES (2, N'today', N'today', 0)
SET IDENTITY_INSERT [dbo].[Account] OFF
SET IDENTITY_INSERT [dbo].[Car] ON 

INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (2, N'Ferrari F8 Spider', N'img/2020_ferrari_f8_spider_orhy.jpg', 450000, N'furious', N' Amazing Car', 2)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (1, N'Ferrari F8 Tributo', N'img/ferrari-f8-tributo-lo-dien-2.jpg', 600000, N'furious', N' Amazing Car', 2)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (4, N'Ferrari Roma', N'img/ferrari-roma-1573712893401414907458.jpg', 350000, N'furious', N' Amazing Car', 2)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (3, N'LaFerrari', N'img/ferrari-laferrari-nhung-dieu-can-biet-2.jpg', 5000000, N'furious', N' Amazing Car', 2)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (8, N'Lamborghini Aventador', N'img/lamborghini-aventador-svj-xago_thanhnien_errn.jpg', 900000, N'fast', N' It is a Lambo', 1)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (9, N'Lamborghini Urus', N'img/anh-bia-urus.jpg', 400000, N'fast', N' It is a Lambo', 1)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (5, N'Porsche 911', N'img/2021-porsche-911-turbo-s-china-20th-anniversary-edition-1-1619079611.jpg', 350000, N'passion', N'We are Porsche', 3)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (6, N'Porsche Boxster', N'img/boxter.jpg', 320000, N'passion', N'We are Porsche', 3)
INSERT [dbo].[Car] ([id], [name], [image], [price], [title], [description], [cateID]) VALUES (7, N'Porsche Panamera', N'img/panamera.jpg', 300000, N'passion', N'We are Porsche', 3)
SET IDENTITY_INSERT [dbo].[Car] OFF
INSERT [dbo].[Category] ([cid], [cname]) VALUES (1, N'Lamborghini')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (2, N'Ferrari')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (3, N'Porsche')
SET IDENTITY_INSERT [dbo].[Contact] ON 

INSERT [dbo].[Contact] ([ID], [user], [email], [inbox]) VALUES (1, N'sun', N'bacontuanloc@gmail.com', N'AMAZING')
SET IDENTITY_INSERT [dbo].[Contact] OFF
INSERT [dbo].[OrderDetail] ([oid], [user], [name], [quantity]) VALUES (1, N'moon', N'Ferrari F8 Spider', 1)
INSERT [dbo].[OrderDetail] ([oid], [user], [name], [quantity]) VALUES (1, N'moon', N'LaFerrari', 1)
INSERT [dbo].[OrderDetail] ([oid], [user], [name], [quantity]) VALUES (2, N'sun', N'Ferrari F8 Tributo', 3)
INSERT [dbo].[OrderDetail] ([oid], [user], [name], [quantity]) VALUES (3, N'sun', N'Ferrari F8 Tributo', 3)
INSERT [dbo].[OrderDetail] ([oid], [user], [name], [quantity]) VALUES (3, N'sun', N'LaFerrari', 2)
SET IDENTITY_INSERT [dbo].[ORDERS] ON 

INSERT [dbo].[ORDERS] ([id], [user], [money]) VALUES (1, N'moon', 5450000)
INSERT [dbo].[ORDERS] ([id], [user], [money]) VALUES (2, N'sun', 1800000)
INSERT [dbo].[ORDERS] ([id], [user], [money]) VALUES (3, N'sun', 11800000)
SET IDENTITY_INSERT [dbo].[ORDERS] OFF
ALTER TABLE [dbo].[Car]  WITH CHECK ADD FOREIGN KEY([cateID])
REFERENCES [dbo].[Category] ([cid])
GO
ALTER TABLE [dbo].[Contact]  WITH CHECK ADD FOREIGN KEY([user])
REFERENCES [dbo].[Account] ([user])
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD FOREIGN KEY([name])
REFERENCES [dbo].[Car] ([name])
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD FOREIGN KEY([user])
REFERENCES [dbo].[Account] ([user])
GO
ALTER TABLE [dbo].[ORDERS]  WITH CHECK ADD FOREIGN KEY([user])
REFERENCES [dbo].[Account] ([user])
GO
