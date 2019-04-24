SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = " \
    http://exiv2.org/builds/${BPN}-${PV}-Source.tar.gz \
    file://0001-cmake-man-pages-only-installed-with-the-exiv2-app.patch \
    file://0002-cmake-ignore-warnings-about-missing-PDB-files-in-3rd.patch \
    file://0003-cmake-Rename-xmp-to-exiv2-xmp-to-avoid-name-conflict.patch \
    file://0004-cmake-Install-header-files-without-globbing.patch \
    file://0005-cmake-Use-correct-installation-dir-for-generated-doc.patch \
    file://0006-cmake-Use-correct-installation-dir-for-cmake-config-.patch \
    file://0007-xmpsdk-Build-with-DBanAllEntityUsage-1.patch \
    file://0008-xmpsdk-Fix-compile-warnings-in-ExpatAdapter.cpp.patch \
    file://0009-Fixes-in-.pc-file-for-being-compatible-with-more-dis.patch \
    file://0010-create-install-exiv2ConfigVersion.cmake.patch \
"
SRC_URI[md5sum] = "57d58c9cef127c5fa24bf0e1fbbd1f8c"
SRC_URI[sha256sum] = "ee88bc81539b73c65010651785d094fad0b39760a424b3c16c17e1856cfef2d7"
PV = "0.27.0"
S = "${WORKDIR}/${BPN}-${PV}-Source"

inherit cmake gettext

