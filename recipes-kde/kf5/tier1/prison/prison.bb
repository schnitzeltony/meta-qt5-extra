SUMMARY = "Barcode abstraction layer"
LICENSE = "BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[sha256sum] = "8f61c6c351e018df29a837a2d276d088b61fc844af406ea2d4f221f8e5b83f4c"

PV = "${KF5_VERSION}"
