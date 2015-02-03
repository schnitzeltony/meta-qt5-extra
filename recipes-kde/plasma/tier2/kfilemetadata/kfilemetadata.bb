SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"


inherit kde-plasma cmake-lib pkgconfig

PV = "5.6.0"
SRC_URI[md5sum] = "38104ee93350ef69428e645da1564a0d"
SRC_URI[sha256sum] = "96a4b5dc68f30ca1f5db773c431d1c1963fe1c6c95f54847e9cb60d10ca3e96d"

DEPENDS += "ki18n karchive"

# TODO: optionals PACKAGECONFIG (not yet in oe: poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += "taglib"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5FileMetaData, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5FileMetaData, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/plugins/kf5/kfilemetadata/.debug"
