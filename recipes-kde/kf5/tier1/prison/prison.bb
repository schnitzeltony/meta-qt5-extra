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

SRC_URI[sha256sum] = "64a46cc9e4447b9b98f7c53e80d9bd78a668770d285f39d7c5dd9159a4c3a349"

PV = "${KF5_VERSION}"
