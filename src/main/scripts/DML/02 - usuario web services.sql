USE [trazaweb]
GO

INSERT INTO [trazaweb].[TZ_USUARIO]
           ([PERSISTENT_VERSION]
           ,[NOMBRE]
           ,[PASSWORD]
           ,[HASH_PWD])
     VALUES
           (0
           ,'labCassara'
           ,'bb86d5f313d308ea1a198dcb8c2594c4e1fcd1c9d27cd5bd68c9b4cba60deb2788c3f424f691f4aed1162e4f945fc59bf23ddedbc27a74ce355d1afc4b8063c5'
           ,null);
GO