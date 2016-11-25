SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"


inherit kde-kf5 pkgconfig

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "124115109c5e82c6e2c232c844dc7bf5"
SRC_URI[sha256sum] = "86fbcf1aa89d7224a99608aeb5cb3d912afe126e14a91c5d571060ec7f77b16b"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
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
