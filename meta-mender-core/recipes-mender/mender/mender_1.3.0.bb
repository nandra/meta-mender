require mender.inc

#SRC_URI = "git://github.com/mendersoftware/mender;protocol=https;branch=1.3.x"
SRC_URI = "git://github.com/nandra/mender;protocol=https;branch=mbe-identity-fix"

# Tag: 1.3.0
SRCREV = "d24ea52129591cc1b841515336f46403d0e27400"

# DO NOT change the checksum here without make sure that ALL licenses (including
# dependencies) are included in the LICENSE variable below.
LIC_FILES_CHKSUM = "file://src/github.com/mendersoftware/mender/LIC_FILES_CHKSUM.sha256;md5=13741fb0210ea8a11a3e8e0247c9429c"
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MIT & OLDAP-2.8"
