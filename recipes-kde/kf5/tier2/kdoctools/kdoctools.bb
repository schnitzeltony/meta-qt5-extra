require ${BPN}.inc

DEPENDS += "${BPN}-native gettext-native karchive ki18n libxslt libxml2"

inherit cmake_lib

SRC_URI += " \
	file://0004-set-meinproc5-executable-so-that-it-can-be-found-for.patch \
"

do_configure_append() {
    # use native docbookl10nhelper
    sed -i 's:\./docbookl10nhelper:${STAGING_BINDIR_NATIVE}/docbookl10nhelper:' ${B}/src/CMakeFiles/docbookl10nhelper.dir/build.make

    # remove build host paths
    sed -i 's:${STAGING_DIR_NATIVE}::g' ${B}/config-kdoctools.h
    sed -i 's:${STAGING_DIR_TARGET}::g' ${B}/config-kdoctools.h
}

do_install_append() {
    # Make sure installed XML/XSL files use relative paths, otherwise they
    # will be unusable once installed in per recipe sysroot.
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/xsl/*.xml
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/*.xsl
    sed -i -e 's@${RECIPE_SYSROOT}${datadir}@../../../../@g' \
        "${D}${datadir}"/kf5/kdoctools/customization/dtd/kdedbx45.dtd

}

# native binaries
CMAKE_ALIGN_SYSROOT[1] = "KF5DocTools, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

# make meinproc5 find kdoctools data
CMAKE_ALIGN_SYSROOT[2] = "KF5DocToolsMacros.cmake, -sCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE}, -sCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE} --srcdir ${OE_QMAKE_PATH_DATA}/kf5/kdoctools"

FILES_${PN}-dev += "${datadir}/kf5/kdoctools/customization"
