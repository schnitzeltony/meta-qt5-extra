require ${BPN}.inc

inherit cmake_lib

SRC_URI += " \
    file://0001-Make-our-cross-build-find-parsetrigrams.patch \
    file://0002-make-build-of-hunspell-optional.patch \
"

DEPENDS += "${BPN}-native"

do_configure_append() {
	# use native parsetrigrams
	sed -i 's:\./parsetrigrams:${STAGING_BINDIR_NATIVE}/parsetrigrams:' ${B}/data/CMakeFiles/trigrams_sonnet.dir/build.make
}

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/sonnet \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/sonnet/.debug \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5Sonnet, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

PACKAGECONFIG ??= "hunspell"
PACKAGECONFIG[hunspell] = "-DBUILD_HUNSPELL=ON,-DBUILD_HUNSPELL=OFF, hunspell"

