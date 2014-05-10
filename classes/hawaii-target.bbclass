EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release"

# REVISIT: dirty hack to avoid libraries using me to fail at configuraton/compilation
do_install_append() {
	# libpath
	for file in $(find ${D}${libdir}/cmake -name '*Targets-release.cmake') ; do
		sed -i 's:\"${libdir}:\"${STAGING_DIR_TARGET}${libdir}:' $file
	done
	# incpath
	for file in $(find ${D}${libdir}/cmake -name '*Targets.cmake') ; do
		sed -i 's:INTERFACE_INCLUDE_DIRECTORIES \":INTERFACE_INCLUDE_DIRECTORIES \"${STAGING_DIR_TARGET}:' $file
	done

}
