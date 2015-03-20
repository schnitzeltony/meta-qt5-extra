SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"


inherit kde-plasma cmake-lib pkgconfig

PV = "5.6.1"
SRC_URI[md5sum] = "12c57ca501117397edbda63f284dae68"
SRC_URI[sha256sum] = "83d375cef080fd9171b84c37229b8f090e69ae4d05196c7baee472f22cfccd70"

DEPENDS += "libav ki18n karchive poppler"

# TODO: optionals PACKAGECONFIG (not yet in oe: poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += "taglib"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5FileMetaData, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5FileMetaData, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dbg += "${libdir}/plugins/kf5/kfilemetadata/.debug"
