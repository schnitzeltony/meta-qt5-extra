SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5 pkgconfig gettext

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1d3c50629123cf5eabf94fba87ff0be9"
SRC_URI[sha256sum] = "0feadb5850557be4d372dcf792c83176276616fc839965c23ed87b7525bc9dd5"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
    qtmultimedia \
    lmdb \
    ki18n \
    karchive \
    libav \
    poppler \
    taglib \
    exiv2 \
"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
