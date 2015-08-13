SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"


inherit kde-kf5 cmake-lib pkgconfig

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "74d278d9c6dab71d3126ba51858a5d02"
SRC_URI[sha256sum] = "0959a19591180216472c9c7845d180d2b16501b266c6ca10e438c745ca2e151c"

DEPENDS += "libav ki18n karchive poppler"

# TODO: optionals PACKAGECONFIG (not yet in oe: poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += "taglib"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5FileMetaData, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5FileMetaData, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
