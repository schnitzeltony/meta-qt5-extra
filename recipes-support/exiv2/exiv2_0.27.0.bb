SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = " \
    http://www.exiv2.org/builds/${BPN}-${PV}a-Source.tar.gz \
"
SRC_URI[md5sum] = "b7f49949deafa96a9e6a22d42bd91031"
SRC_URI[sha256sum] = "a4adfa7aaf295b0383adead476f8e0493b9d6c6c7570d5884d2ebf8a2871902f"

S = "${WORKDIR}/${BPN}-${PV}-Source"

inherit cmake gettext
