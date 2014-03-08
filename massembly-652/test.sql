
-- don't work
exec DB.sys.sp_addextendedproperty
  @name='Version'
, @value='${project.version}'
go

-- work but not what is wanted
exec DB.sys.sp_addextendedproperty
  @name='Version'
, @value='@${project.version}'
go

