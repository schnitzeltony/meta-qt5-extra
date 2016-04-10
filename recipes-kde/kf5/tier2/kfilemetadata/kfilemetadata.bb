SUMMARY = "A file metadata and text extraction library"
LICENSE = "MIT & LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"


inherit kde-kf5 cmake-lib pkgconfig

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "13b348dd4fed495fbdc6cc2852dfc7ba"
SRC_URI[sha256sum] = "809e0edf6a2b4e84a394c1e69e5b374b72964d3fea84f66da5b370f6d5dfacca"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
    lmdb \
    ki18n \
    karchive \
    libav \
    poppler \
    taglib \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5FileMetaData, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5FileMetaData, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
