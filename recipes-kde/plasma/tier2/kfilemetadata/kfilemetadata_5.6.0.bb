SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde cmake-lib pkgconfig

DEPENDS += "ki18n karchive"

# TODO: optionals PACKAGECONFIG (not yet in oe: poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += "taglib"

SRCREV = "a674091d00b8159a788afef3d65436529aae3ba7"
S = "${WORKDIR}/git"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5FileMetaData, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5FileMetaData, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/plugins/kf5/kfilemetadata/.debug"
