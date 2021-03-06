USE [J3.L.P0011]
GO
/****** Object:  Table [dbo].[Home]    Script Date: 3/23/2020 9:48:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Home](
	[id] [int] NOT NULL,
	[type] [nvarchar](50) NOT NULL,
	[title] [nvarchar](50) NOT NULL,
	[imgLink] [nvarchar](50) NULL,
	[shortContent] [nvarchar](max) NULL,
	[fullContent] [nvarchar](max) NULL,
	[author] [nvarchar](50) NULL,
	[createDate] [date] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Information]    Script Date: 3/23/2020 9:48:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Information](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[content] [nvarchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[View]    Script Date: 3/23/2020 9:48:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[View](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ViewCount] [bigint] NOT NULL,
 CONSTRAINT [PK_View] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (1, N'pen', N'Essential skills for a happy life!', N'g.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam. Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', NULL, CAST(N'2020-01-16' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (2, N'note', N'You ''ve gotta dance', NULL, N'“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.”', N'“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.”', N'William W. Purkey', CAST(N'2020-01-16' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (3, N'camera', N'Photo', N'photo.jpg', NULL, NULL, NULL, CAST(N'2020-11-16' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (4, N'note', N'Make color your life', N'g.jpg', N'“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.”', N'“You''ve gotta dance like there''s nobody watching,
Love like you''ll never be hurt,
Sing like there''s nobody listening,
And live like it''s heaven on earth.”', N'JM Thuong', CAST(N'2020-11-16' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (6, N'camera', N'a picture', N'photo.jpg', NULL, NULL, NULL, CAST(N'2020-06-21' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (7, N'camera', N'<3', N'g.jpg', NULL, NULL, NULL, CAST(N'2020-11-22' AS Date))
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [author], [createDate]) VALUES (5, N'pen', N'Pass lap', N'g.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam. Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. At eam doctus oportere, eam feugait delectus ne. Quo cu vulputate persecuti. Eum ut natum possim comprehensam, habeo dicta scaevola eu nec. Ea adhuc reformidans eam. Pri dolore epicuri eu, ne cum tantas fierent instructior. Pro ridens intellegam ut, sea at graecis scriptorem eloquentiam. Per an labitur lucilius ullamcorper, esse erat ponderum ad vim. Possim laoreet suscipit ex pri, vix numquam eruditi feugait in. Nec maluisset complectitur te, at sea decore semper. Falli numquam perpetua sea et, tibique repudiandae an pro. Ut his solum persius postulant. Soluta nemore debitis ne eos, cum an scripta pericula partiendo.', NULL, CAST(N'2020-06-22' AS Date))
INSERT [dbo].[Information] ([id], [name], [content]) VALUES (1, N'Vivianne Russell', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. 

Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum.')
SET IDENTITY_INSERT [dbo].[View] ON 

INSERT [dbo].[View] ([ID], [ViewCount]) VALUES (1, 2330)
SET IDENTITY_INSERT [dbo].[View] OFF
ALTER TABLE [dbo].[View] ADD  CONSTRAINT [DF_View_ViewCount]  DEFAULT ((0)) FOR [ViewCount]
GO
