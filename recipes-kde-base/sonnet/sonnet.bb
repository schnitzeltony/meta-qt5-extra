require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native"

do_configure_append() {
	# use native parsetrigrams
	sed -i 's:\./parsetrigrams:${STAGING_BINDIR_NATIVE}/parsetrigrams:' ${B}/data/CMakeFiles/trigrams_sonnet.dir/build.make
}

CMAKE_HIDE_ERROR[1] = "KF5Sonnet, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Sonnet, -S${includedir}, -S${STAGING_INCDIR}"

